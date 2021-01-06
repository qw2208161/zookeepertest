package cn.zq.threadtest.AQS;


import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.AbstractQueuedSynchronizer;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

/**
 * description: 仅允许两个线程连接的锁
 *
 * @author 周志钦（zhiqin.zhou@ucarinc.com）
 * @version 1.0
 * @date 2020-12-10 16:15:57
 */
public class TwinsLock implements Lock {
    //自定义类实现AbstractQueueSynchronizer
    private final Sync sync = new Sync(2);
    private static final class Sync extends AbstractQueuedSynchronizer {
        Sync(int count) {
            if(count <= 0) {
                throw new IllegalArgumentException("count must large than 0");
            }
            //
            setState(count);
        }

        @Override
        public int tryAcquireShared(int reduceCout) {
            for(;;) {
                int current = getState();
                int newCount = current - reduceCout;
                if(newCount < 0 || compareAndSetState(current,newCount)) {
                    //这个值如果小于0直接返回，外面判断它的值 或者 值设置成功
                    // <0设置失败，》0就成功
                    return newCount;
                }
            }
        }

        @Override
        public boolean tryReleaseShared(int returnCount) {
            for(;;) {
                int current = getState();
                int newCount = current + returnCount;
                if(compareAndSetState(current,newCount)) {
                    //这个值加的上去，代表释放成功
                    return true;
                }
            }
        }
    }


    @Override
    public void lock() {
        sync.tryAcquireShared(1);
    }

    @Override
    public void lockInterruptibly() throws InterruptedException {

    }

    @Override
    public boolean tryLock() {
        return false;
    }

    @Override
    public boolean tryLock(long time, TimeUnit unit) throws InterruptedException {
        return false;
    }

    @Override
    public void unlock() {
        sync.tryReleaseShared(1);
    }

    @Override
    public Condition newCondition() {
        return null;
    }
}

package Observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Timekeeper
 */
public class Subject {

    private List<Observer> observerList;

    private int state;

    /**
     * 为这个事件/主题添加观察者
     *
     * @author Timekeeper
     */
    public void subscribe(Observer observer) {
        if (observerList == null || observerList.size() == 0) {
            observerList = new ArrayList<>();
        }
        observerList.add(observer);
    }

    /**
     * 更新状态
     *
     * @author Timekeeper
     */
    public void update(int state) {
        System.out.println("状态发生变化---------------");
        this.state = state;
        notifyObs();
    }

    /**
     * 通知观察者
     *
     * @author Timekeeper
     */
    private void notifyObs() {
        if (observerList == null || observerList.size() == 0) {
            return;
        }
        for (Observer observer : observerList) {
            System.out.println("通知观察者对象名称：" + observer.getName());
        }
    }


}

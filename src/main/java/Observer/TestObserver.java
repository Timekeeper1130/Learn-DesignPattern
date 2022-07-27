package Observer;

/**
 * @author Timekeeper
 */
public class TestObserver {

    public void test() {
        Observer obs1 = new Observer("tk1");
        Observer obs2 = new Observer("tk2");
        Observer obs3 = new Observer("tk3");
        Subject subject = new Subject();
        subject.subscribe(obs1);
        subject.subscribe(obs2);
        subject.subscribe(obs3);
        subject.update(1);
        subject.update(2);
    }

}

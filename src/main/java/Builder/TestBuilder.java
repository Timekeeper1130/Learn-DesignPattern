package Builder;

/**
 * @author WengHaoo
 */
public class TestBuilder {

    public void test() {
        Person p = new Person.Builder()
                .name("翁浩")
                .age(22)
                .sex("男")
                .isMarried(true)
                .build();
        System.out.println(p);
    }

}

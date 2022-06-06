package Builder;

import java.math.BigDecimal;

/**
 * @author WengHaoo
 */
public class Person {

    /**
     * 姓名
     */
    private String name;

    /**
     * 年龄
     */
    private Integer age;

    /**
     * 性别
     */
    private String sex;

    /**
     * 长相评分
     */
    private BigDecimal score;

    /**
     * 身高
     */
    private BigDecimal height;

    /**
     * 体重
     */
    private BigDecimal weight;

    /**
     * 已婚/未婚
     */
    private Boolean isMarried;

    public Person(Builder builder) {
        // 可以在这里进行某些校验
        this.name = builder.name;
        this.age = builder.age;
        this.sex = builder.sex;
        this.score = builder.score;
        this.height = builder.height;
        this.weight = builder.weight;
        this.isMarried = builder.isMarried;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setScore(BigDecimal score) {
        this.score = score;
    }

    public void setHeight(BigDecimal height) {
        this.height = height;
    }

    public void setWeight(BigDecimal weight) {
        this.weight = weight;
    }

    public void setMarried(Boolean married) {
        this.isMarried = married;
    }

    public static final class Builder {
        private String name;
        private Integer age;
        private String sex;
        private BigDecimal score;
        private BigDecimal height;
        private BigDecimal weight;
        private Boolean isMarried;
        public Builder name(String name) {
            this.name = name;
            return this;
        }
        public Builder age(Integer age) {
            this.age = age;
            return this;
        }
        public Builder sex(String sex) {
            this.sex = sex;
            return this;
        }
        public Builder score(BigDecimal score) {
            this.score = score;
            return this;
        }
        public Builder height(BigDecimal height) {
            this.height = height;
            return this;
        }
        public Builder weight(BigDecimal weight) {
            this.weight = weight;
            return this;
        }
        public Builder isMarried(Boolean isMarried) {
            this.isMarried = isMarried;
            return this;
        }
        public Person build() {
            // 通过这种方法，可以在构造函数里面进行某些校验
            return new Person(this);
        }
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                ", score=" + score +
                ", height=" + height +
                ", weight=" + weight +
                ", isMarried=" + isMarried +
                '}';
    }
}

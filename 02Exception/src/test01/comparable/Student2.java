package test01.comparable;

import java.util.Comparator;

/**
 * <p>Title: Student2.java</p>
 * <p>Description: 学生实体类</p>
 * <p>Copyright: Copyright (c) 2021</p>
 *
 * @author wuchun
 * @version 1.0
 * @date 2022年02月24日 09:57:00
 */
public class Student2 implements Comparable<Student2> {
    private int id;
    private String name;
    private double score;

    public Student2(int id, String name, double score) {
        this.id = id;
        this.name = name;
        this.score = score;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student2{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", score=" + score +
                '}';
    }

    /**
     * 这个排序规则有限是最低的，只有在不使用Comparator比较器时才会生效
      */
    @Override
    public int compareTo(Student2 o) {
        return this.id - o.id;
    }
}

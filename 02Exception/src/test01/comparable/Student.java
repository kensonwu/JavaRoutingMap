package test01.comparable;

/**
 * <p>Title: Student.java</p>
 * <p>Description: 学生实体类</p>
 * <p>Copyright: Copyright (c) 2021</p>
 *
 * @author wuchun
 * @version 1.0
 * @date 2022年02月24日 09:14:00
 */
public class Student implements  Comparable<Student>{
    private int id;
    private String name;
    private double score;

    /**
     * 返回值：
     *      正数  前一个元素比后一个元素大， 位置交换
     *      负数  前一个元素比后一个元素大   位置不动
     *      0    前一个元素与后一个元素相等  位置不动
     */
    @Override
    public int compareTo(Student o) {
        // 升序
        //return this.id - o.id;
        // 降序
        //return o.id - this.id;
        // 按照分数升序排列， 注意此处score是double
        return (int) (this.score * 100 - o.score * 100);
    }

    public Student(int id, String name, double score) {
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
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", score=" + score +
                '}';
    }
}

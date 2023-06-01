// 1. 기본생성자, 오버로딩된 생성자.
// 2. Getter, Setter
// 3. @Override equals()
// 4. @Override toString() JSON형식 ==> code-gen으로 만든 후에 편집
// 5. Option : 객체를 복사할 일이 많은경우 Clone()을 만들어주면 좋다.

import java.util.Arrays;

public class Student implements Cloneable {
    private String  name;   // 이름
    private int     num;    // 학번
    private int[] score;    // 성적
 
    public Student() {

    }

    public Student(String name, int num) {
        this.name = name;
        this.num = num;
        
    }

    public void setScore(int[] score)
    {
        this.score = score;
    }

    public void setScore(int s0, int s1, int s2)
    {
        this.score[0] = s0;
        this.score[1] = s1;
        this.score[2] = s2;
        
    }



    public int[] getScore()
    {
        return this.score;
    }


    @Override
    public boolean equals(Object obj)
    {
        Student target = null;
        if (obj instanceof Student)
        {
            target = (Student)obj;
        }
        else
        {
            return false;
        }
        
        if (false == this.name.equals(target.name)) {   
            return false;
        }

        if (this.num != target.num) {   
            return false;
        }

        return true;

    }


    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNum() {
        return this.num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    @Override
    public int hashCode()    
    {
        return (super.hashCode() + num);
    }
    

    @Override
    public String toString() {
        return "{" +
            " name='" + getName() + "'" +
            ", num='" + getNum() + "'" +
            " " + score[0] + "  " + score[1] + "  " + score[2] +  
            "}";
    }

    @Override
    public Object clone() throws CloneNotSupportedException
    {
        Student newObject = (Student)super.clone();
        newObject.score = Arrays.copyOf(score, score.length);

        return newObject;
    }

}

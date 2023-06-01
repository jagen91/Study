package Rectangle;
// 1. 기본생성자, 오버로딩 생성자
// 2. Getter, Setter
// 3. @Override equals() (무지성X)
// 4. hashcode()
// 5. @Override toString() JSON형식(key-value) ==> code-gen으로 만든 후에 편집 (무지성X)
// 6. Option : 객체를 복사할 일이 많은 경우 Clone()을 만들어주면 좋다.

// x, y 좌표를 저장하기 위한 클래스
public class Point implements Cloneable{
    private int xPos;   // x좌표
    private int yPos;   // y좌표

    // 기본생성자
    public Point()
    {
        xPos = 0;
        yPos = 0;
    }

    // 오버로딩 생성자
    public Point(int xPos, int yPos)
    {
        this.xPos = xPos;
        this.yPos = yPos;
    }

    // Getter / Setter
    public int getXPos() {
        return this.xPos;
    }

    public void setXPos(int xPos) {
        this.xPos = xPos;
    }

    public int getYPos() {
        return this.yPos;
    }

    public void setYPos(int yPos) {
        this.yPos = yPos;
    }

    @Override
    public boolean equals(Object obj)
    {
        if (obj instanceof Point point)
        {
            if (point.getXPos() != this.getXPos())
            {
                return false;
            }

            if (point.getYPos() != this.getYPos())
            {
                return false;
            }

            return true;

        }
        return false;
    }

    @Override
    public int hashCode()   
    {
        int hashCode = super.hashCode();
        return hashCode;
    }

    // 클론
    public Object clone() throws CloneNotSupportedException
    {
        return super.clone();
    }

    @Override
    public String toString() {
        return "{" +
            " xPos='" + getXPos() + "'" +
            ", yPos='" + getYPos() + "'" +
            "}";
    }

}

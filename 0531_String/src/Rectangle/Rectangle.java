package Rectangle;
// 사각형 클래스
public class Rectangle implements Cloneable{
    private Point leftTop;
    private Point rightBottom;

    // 기본생성자
    public Rectangle()
    {
        leftTop = new Point();
        rightBottom = new Point();
    }

    // 오버로딩 생성자
    public Rectangle(Point leftTop, Point rightBottom) throws WrongPointException
    {
        this.leftTop = leftTop;
        this.rightBottom = rightBottom;

        if ((0 >= getWidth()) || (0 >= getHeight()))
        {
            throw new WrongPointException();
        }
        
    }


    public Rectangle(int left, int top, int right, int bottom) throws WrongPointException
    {
        this.leftTop = new Point(left, top);
        this.rightBottom = new Point(right, bottom);

        if ((0 >= getWidth()) || (0 >= getHeight()))
        {
            throw new WrongPointException();
        }       
    
    }


    // Getter / Setter
    public Point getLeftTop() 
    {
        return this.leftTop;
    }

    public void setLeftTop(Point leftTop) {
        this.leftTop = leftTop;
    }

    public void setLeftTop(int left, int top)
    {
        this.leftTop.setXPos(left);
        this.leftTop.setYPos(top);
    }

    public Point getRightBottom() 
    {
        return rightBottom;
    }

    public void setRightBottom(Point rightBottom) 
    {
        this.rightBottom = rightBottom;
    }

    public void setRightBottom(int right, int bottom) 
    {
        rightBottom.setXPos(right);
        rightBottom.setYPos(bottom);
    }

    @Override
    public boolean equals(Object obj)
    {
        Rectangle target = null;

        if (obj instanceof Rectangle)
        {
            target = (Rectangle)obj;
        
            if (false == leftTop.equals(target.leftTop))
            {
                return false;
            }
            
            if (false == rightBottom.equals(target.rightBottom))
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
        return super.hashCode();
        
    }

    @Override
    public String toString() {
        return "{" +
            " leftTop='" + getLeftTop().toString() + "'" +
            ", rightBottom='" + getRightBottom().toString() + "'" +
            "}";
    }

    // 클론
    public Object clone() throws CloneNotSupportedException
    {
        Rectangle cloneObject = (Rectangle)super.clone();

        cloneObject.leftTop = (Point)this.leftTop.clone();
        cloneObject.rightBottom = (Point)this.rightBottom.clone();
        
        return cloneObject;
    }

    // 가로 구하는 메소드
    public int getWidth()
    {
        int width = rightBottom.getXPos() - leftTop.getXPos();
        return width;
    }

    // 세로 구하는 메소드
    public int getHeight()
    {
        int height = leftTop.getYPos() - rightBottom.getYPos();
        return height;
    }

    // 사각형의 넓이를 구하는 메소드
    public int getArea()
    {
        return getWidth() * getHeight();
    }

    // 사각형의 둘레를 구하는 메소드
    public int getPerimeter()
    {
        return (getWidth() * 2) + (getHeight() * 2);
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai1a;

/**
 *
 * @author langk
 */
public class StackDemo {
    private final int n; // Số Phần tử của Stack
    private int top; //HEAD của stack
    public int[] a;
    public StackDemo(int n) {
        top = -1;
        this.n = n;
        a = new int[n];
    }
    public boolean isEmpty() //kiểm tra có trống k
        {
            return top == -1;
        }
     public boolean isFull() // kiểm tra có đầy không
        {
            return top==n-1;
        }
       public void Push(int newelement) //thêm 
        {
            if (isFull() == false) ////nếu stack còn chỗ trống top++,a[top]=x
            {
                top = top + 1;
                a[top] = newelement;
            }
            else // nếu stack đầy
            {
                System.out.println("Stack bị đầy");
            }
        }
        public void Pop() // lấy ra 1 phần tử
        {
            if (!isEmpty())
            {
                top = top - 1;
            }
            else
            {
                System.out.println("Stack rỗng không lấy được");
            }
        }
        public void Output()
        {
            if (!isEmpty())
            {   
                for (int i = 0; i <= top; i++)
                    System.out.println(a[i]);
            }
            else
                System.out.println("Stack rỗng không có gì");
        }

}

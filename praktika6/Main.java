package com.company;

public class Main {
    public static void Sort(Student[] a, int left, int right){
        int l = left, r = right;
        int piv = a[(l + r) / 2].IDNumber; // Опорным элементом возьмём средний
        while (l <= r)
        {
            while (a[l].IDNumber < piv)
                l++;
            while (a[r].IDNumber > piv)
                r--;
            if (l <= r) {
                int c = a[l].IDNumber;
                a[l].IDNumber = a[r].IDNumber;
                a[r].IDNumber = c;
                 l++;
                 r--;
            }
        }
        if (left < r)
            Sort (a, left, r);
        if (right > l)
            Sort (a, l, right);
    }

    public static void main(String[] args) {
        Student arr[] = new Student [10];
        arr[0] = new Student(1, "Bob");
        arr[9] = new Student(2, "Jhon");
        arr[3] = new Student(3, "Jey");
        arr[7] = new Student(4, "Ivan");
        arr[8] = new Student(5, "Sasha");
        arr[5] = new Student(6, "Petya");
        arr[2] = new Student(7, "Vasya");
        arr[6] = new Student(8, "Artem");
        arr[4] = new Student(9, "Dima");
        arr[1] = new Student(10, "Parviz");
        for (int i = 0; i<10; i++){
            System.out.println(arr[i]+" ");
        }
        System.out.println("-------------------------------");
        Sort (arr,0, 9);
        for (int i = 0; i<10; i++){
            System.out.println(arr[i]+" ");
        }
    }
}

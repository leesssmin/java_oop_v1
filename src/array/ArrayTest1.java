package array;

public class ArrayTest1 {

    public static void main(String[] args) {

        // 배열이란? - 연관된 데이터 타입을 한번에 모아서 통으로 관리하기 위해 사용 할 수 있다.

        //배열을 선언하는 문법
        // 규칙 1.
        // 배열은 반드시 먼저 몇개의 데이터가 들어갈지 크기를 지정해야 사용할 수 있다.

        //int[] numbers; // 배열의 선언
        //numbers = new int[3]; //4바이트 네모칸 3개 선언(초기화)

        int[] numbers = new int[3];    // 데이터 타입에 대괄호 문법 허용
        int intBoxes[] = new int[5];   // 변수 뒤에 대괄호 문법 허용

        //위에 문법은 [][][] <--- 값이 아직 안들어간 상태.
        // 배열 선언과 동시에 값을 초기화 해보자.
        int[] grades = new int[] {1,2,3};
        // [1][2][3]
        int[] grades2 = {1,2,3,4,5,6};
        //[1][2][3][4][5][6]

        // 문제
        // 5개의 크기를 가지는 double 타입 배열을 선언
        // 배열 이름은 마음대로 작성
        double[] doubles = new double[5];//길이를 작성해야한다.
        doubles[0] = 1.0;
        doubles[1] = 1.1;
        doubles[2] = 1.2;
        doubles[3] = 1.3;
        doubles[4] = 1.4;
        // 중요! -  모든 프로그래밍 언어에 인덱스 번호는 0부터 시작한다.

        //doubles 배열에 길이는 얼마일까? - 5개
        //doubles 엔덱스에 길이는? - 인덱스의 길이:4
        // 모든 인덱스의 길이는 n-1
        // doubles[5] =1.5;

        int[] array1 = new int[57];
        //배열의 길이 = 57
        //인덱스의 길이 = 56

        int[] array2 = new int[157];
        // 인덱스의 길이 156

        //String 배열 선언 방법
        String[] stringBox = new String[3];
        stringBox[0] = "가";
        stringBox[1] = "나";
        stringBox[2] = "다";

        System.out.println("------------------------");
        System.out.println(stringBox.length);  //배열의 길이
        System.out.println(stringBox[0]);
        System.out.println(stringBox[1]);
        System.out.println(stringBox[2]);

        //                    3
        for(int i = 0; i < stringBox.length; i++){
            // i =0
            // i =1
            // i =2
            System.out.println(stringBox[i]);
        }





    }// end of main

}// enf of class

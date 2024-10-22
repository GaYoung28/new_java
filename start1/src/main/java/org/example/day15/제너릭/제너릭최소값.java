package org.example.day15.제너릭;

public class 제너릭최소값 {
    // 제네릭 메서드를 이용한 배열 최소값 찾기
    public static <T extends Comparable<T>> T findMin(T[] array) {
        T min = array[0];  // 첫 번째 값을 초기 최소값으로 설정
        for (T element : array) {
            if (element.compareTo(min) < 0) {
                min = element;
            }
        }
        return min;
    }

    public static void main(String[] args) {
        // 정수 배열의 최소값 찾기
        Integer[] intArray = {1, 3, 5, 7, 9};
        System.out.println("정수 배열의 최소값: " + findMin(intArray));
        // 문자열 배열의 최소값 찾기 (사전순으로 가장 앞에 오는 값)
        String[] stringArray = {"apple", "banana", "orange"};
        System.out.println("문자열 배열의 최소값: " + findMin(stringArray));
    }
}

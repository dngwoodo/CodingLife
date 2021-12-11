// Example #6

// 요구사항
// - 2단 출력 -> 2 * 1 = 2, 2 * 2 = 4, ..., 2 * 9 = 18
// - 2~9단 출력 -> 2 * 1 = 2, ..., 9 * 9 = 81
//
// 1. 중복을 발견 -> 패턴 발견 -> 중복 제거
// 2. 반복의 3요소? => 초기값 지정 + 조건 확인 + 상태 변경
// 3. for문 => for (초기값 지정; 반복 조건; 반복할 때마다 실행될 것)
// 4. 응집도가 높다. 끼리끼리 논다. 반복이라는 주제, 관심사에 따라 뭉침.
// 5. 관례 -> 반복문에서 반복할 때 쓰는 정수형(int) 변수는 i로 쓴다.
//        -> 그 다음은 j, k, l, ....
//        => 하지만 j까지만 쓰자(너무 많이 쓰면 복잡하다). 2 depth 까지만...
// 6. Escape 문자 (탈출 문자, 특수 문자)
//    - "\n" -> new line (다음 줄로 넘김)
//    - "\t" -> tab (넓게 간격을 띄어주면서 열을 맞춤)
// 7. 반복문 탈출 -> break
// 8. 반복문에서 아래만 skip -> continue
// 9. Flow Control -> 복잡한 걸 처리할 수 있게 됨. = 프로그램이 복잡해짐.
//                 -> 정답이 뚜렷하지 않을 수 있음.
//                 -> 더 나은 방법은 존재함.
//                 => k는 쓰면 안 되나? 고민... -> 토론 / 질문 / 실험
// 10. 어떻게 하면 더 나은 구조로 바꿀 수 있을까? => 다음 주, 다다음 주 등에 배웁니다.

public class GuguClass {
    public static void main(String[] args) {
        for (int i = 2; i < 10; i += 3) {
            for (int j = 1; j < 10; j += 1) {
                for (int k = i; k < i + 3; k += 1) {
                    if (k == 10) {
                        break;
                    }

                    System.out.print(k + " * " + j + " = " + (k * j));

                    System.out.print("\t");
                }

                System.out.println();
            }

            if (i + 2 == 10) {
                break;
            }

            System.out.println();
        }
    }
}

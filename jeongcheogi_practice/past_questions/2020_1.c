#include <stdio.h>

// align이란 함수는 a라는 정수배열을 파라미터로 받아 반환값이 없는 함수
void align(int a[ ]) {
int temp;
for (int i = 0; i < 4; i++) {
  // 반복문의 결과에서 가장 마지막에 위치하는 것은 가장 큰 수로, 제외함
  for (int j=0; j < 4 - i; j++)  {
    // 배열의 요소가 자신의 다음 요소보다 크면 자리를 바꿈
    if (a[j]> a[j+1]) {
      temp = a[j];
      a[j] = a[j+1];
      a[j+1] = temp;
    // 큰 수가 뒤로 가게 됨
    }
  }
}

main( ) {
    int a[ ] = { 85, 75, 50, 100, 95 };
    align(a);
    // {50, 75, 85, 95, 100}
     for (int i = 0; i < 5; i++) printf("%d ", a[i]);
}

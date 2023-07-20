#include <stdio.h> // STEP1.1
#include <limits.h> 
#include <float.h>  // STEP1.2
#define _CRT_SECURE_NO_WARNINGS // scanf 함수 에러... 그냥 scanf_s 씀



// https://sejong-kr.libguides.com/c.php?g=942233&p=6822320
// 주석
/* 범위주석 */
// 문장 끝에서는 세미콜론;
// c언어에서는 보통 { 시작될 때 들여쓰기
// 언제나 main 함수를 가지고 있어야 함.
// 함수의 형태 (출력)자료형 함수이름 (입력형태) 
// 입력 형태에 void 입력

// C언어는 절차지향적 언어, 위에서부터 써야함
// 원래 컴파일러는 처음보는 함수에 대해 컴파일러 에러를 발생시킴
// 하지만 extern 함수들을 만나면 자동으로 int형으로 변환시킨다.
// 반환값이 없어도 int로 선언된 함수는 실행할 수 있다 (왜?)

//void step1_a();


void main(void) {
	//hello();
	step1_a();
	//step1_b();
	//step1_c();
	//step1_d();
	//step2_a();
	//step2_b();
	//step2_c();
}


int hello(void) {
	printf("Hello world! \n");
	return 0;
}

// STEP 1.1 : 표준 입출력 함수

// Standard Input/Output library
//#include <stdio.h>

// printf() 표준출력함수
int step1_a() {
	printf("안녕하세요?\n");
	printf("제 나이는 %d살입니다.\n", 30);
}

// scanf() 함수
// 여러 종류의 데이터를 다양한 서식에 맞춰 입력 받을 수 있게 해줌.
// 입력된 데이터를 저장할 변수 이름 앞에 &(주소 연산자)가 붙어야 한다.(변수의 메모리 주소)
int step1_b(void) {
	int result;
	int num1, num2;

	printf("첫번째 정수를 입력하세요 : ");
	scanf_s("%d", &num1);
	printf("두번째 정수를 입력하세요 : ");
	scanf_s("%d", &num2);

	result = num1 + num2;
	printf("%d + %d = %d", num1, num2, result);
}


// STEP 1.2 : 변수
// 초기화하지 않은 변수에는 쓰레기값(다른 프로그램이 사용하던 메모리)이 들어가기 때문에 반드시 원하는 값으로 초기화
// C언어의 기본 자료형
// 정수형에 long long 이나 실수형에 long double 말고는 java와 동일

// 정수 자료형의 최댓값과 최솟값의 범위 라이브러리
// <limits.h>
// 실수 자료형의 최댓값, 최솟값 범위 라이브러리
// <float.h>
int step1_c(void) {
	short s1;
	short overs;
	short unders;
	// 중간은 생략
	long long ll;
	long long oll;
	long long ull;

	s1 = 1;
	overs = SHRT_MAX + 1;
	unders = SHRT_MIN - 1;

	ll = LLONG_MAX;
	oll = LLONG_MAX + 1;
	ull = LLONG_MIN - 1;

	// 실수는 나중에...
	// 실수 언더플로우는 0또는  쓰레기 값, 실수 오버플로우는 inf(infinity)

	// 정수 자료형의 이름 앞에 unsigned 선언을 추가할 시 0과 양의 정수만 표현가능
	// 하지만 printf의 %d는 10진수로 변환하기 때문에 오류없이 출력됨
	// unsigned로 할당된 값을 출력, 잘못된 값이 할당되었을 시 다른 값이 나옴
}

// STEP 1.3 : 연산자
// 연산자 : 산술연산자, 대입연산자, 증감연산자, 관계연산자, 논리연산자
// 비트 연산자 
// 기타 연산자 : 형 변환 연산자, 삼항 연산자, 콤마 연산자, sizeof 연산자, 포인터 연산자
// sizeof연산자 : 피연산자의 크기를 바이트 단위로 반환
int step1_d(void) {

	unsigned int num;
	num = sizeof(int);

	printf("2진수 변환 : ");
	//이진수 출력
	for (int i = 7; i >= 0; --i) { //8자리 숫자까지 나타냄
		int result = num >> i & 1;
		printf("%d", result);
	}

}

// 포인터 연산자( &, * )
// & : 변수의 이름 앞에 사용, 해당 변수의 주소값 반환
// * : 참조 연산자 : 포인터의 이름이나 주소 앞에 사용, 포인터에 가리키는 주소에 저장된 값을 반환

// STEP 2.1 : 포인터

// 포인터 : 메모리의 주소값을 저장하는 변수
// 선언(자료형은 포인터가 가리키고자 하는 변수의 자료형 명시)

// 자료형 * 포인터이름; 

// 초기화 없이 참조 연산자를 사용할 시 의도하지 않은 메모리 장소에 값을 저장하게 됨.
// 선언과 동시에 초기화를 하는 것이 좋음

// 자료형 * 포인터이름 = &변수이름;
// 자료형 * 포인터이름 = 주소값;
int step2_a(void) {
	int num;
	int* pnum;

	pnum = &num;
	*pnum = 10;

	printf("변수명으로 num 값 출력 : %d\n", num);
	printf("포인터값으로 num 값 출력 : %d",  *pnum);
	
}

// 이중 포인터
// 포인터 변수를 저장하는 다른 포인터 변수

int step2_b(void) {
	int* ptr;
	int** dptr;
	int num = 10;

	ptr = &num;

	dptr = &ptr;

	printf(" %d", **dptr);
}

// 포인터의 const선언
// 포인터에 사용하는 const는 상수로 만드는 것이 아니라, 포인터를 통한 변경을 허용하지 않는다는 의미
// 포인터를 통해 변수 num 값을 변경하는 것만 막을 수 있습니다.

int step2_c(void) {
	int num = 10;
	const int* p = &num;

	//*p = 20;    // 컴파일 에러
	num = 20;

	printf("변수 num : %d\n", *p);

	return 0;
}

// 포인터와 배열
// 자료형이 같은 변수를 메모리에 연속적으로 할당했기 때문에 첫 데이터의 주소만 알면 나머지도 알 수 있다.
int step2_d(void) {

}

// 문자열 배열
// char형 배열 넉넉하게 선언
// 빈자리에는 \0(null)이라는 특수문자 삽입
// strcpy함수가 char형 배열에 새로운 문자열을 저장하는 함수 
// <string.h> 파일 인크루드
// 문자열을 입력받는 배열은 이름 자체가 배열의 주소값을 의미하므로, &포인터 연산자를 쓰지 않는다.
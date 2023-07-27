// dllmain.cpp : DLL 애플리케이션의 진입점을 정의합니다.
#include "pch.h"

BOOL APIENTRY DllMain(HMODULE hModule,
	DWORD  ul_reason_for_call,
	LPVOID lpReserved
)
{
	switch (ul_reason_for_call)
	{
	case DLL_PROCESS_ATTACH:
	case DLL_THREAD_ATTACH:
	case DLL_THREAD_DETACH:
	case DLL_PROCESS_DETACH:
		break;
	}
	return TRUE;
}

//  DLL에 구현한 함수를 외부로 노출시키려면 __declspec(dllexport) 키워드를 사용해야 한다. 해당 키워드가 없으면 호출불가
//  __stdcall은 Win32 API 함수 호출에 이용됨


#include <math.h>
extern "C" __declspec(dllexport) double __stdcall dq(int n) {
	return sqrt(n);
}
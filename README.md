# Optimi

[![Java](https://img.shields.io/badge/java-17-ED8B00.svg?logo=java)](https://www.oracle.com/kr/java/)
[![Gradle](https://img.shields.io/badge/gradle-7.5.0-02303A.svg?logo=gradle)](https://gradle.org)
[![Youtube](https://img.shields.io/badge/youtube-유농밀크-red.svg?logo=youtube)](https://www.youtube.com/channel/UCopVwSxedoV4jdr7zDjkmIg)


### Optimi 자바 라이브러리 / Optimi Java Library
----
### Optimi에 관하여
* #### Optimi는 무엇인가
  * Optimi는 자바 코드를 최적화하기 위해 만들어졌다.
* #### Optimi의 의미는 무엇인가
  * Optimization을 줄여서, Optimi라는 이름을 가졌다.
  * 그만큼 최적화를 위한 라이브러리라는 뜻이다.
----
### Optimi 사용법

* #### CMD 출력
#### 기존에 써야 하는 코드
```
System.out.println("라라라");
```
#### Optimi를 이용한 코드
```
CMD.print("라라라");
```
* #### Swing 창 만들기
#### 기존에 써야 하는 코드
```
JFrame frame = new JFrame("제목")
frame.setSize(150, 100);
frame.setLayout(null);
frame.setVisible(true);
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
```
#### Optimi를 이용한 코드
```
JFrame frame = OpWin.createFrame("제목", 150, 100);
OpWin.activeFrame(frame);
```
* #### 시간 값 얻기
#### 기존에 써야 하는 코드
```
LocalTime.of(LocalTime.now().getHour(), LocalTime.now().getMinute(), LocalTime.now().getSecond()).toString;
```
#### Optimi를 이용한 코드
```
OpTime.hour_minute_second // 7:34:05 (예시)
```

* #### 문자열의 특정 부분 값 불러오기
#### 기존에 써야 하는 코드
```
String data = "";
for (int i = 1; i <= 3 - 1; i++) {
    data += text.charAt(i);
}
```
#### Optimi를 이용한 코드
```
data = gets(text, 1, 3)
```
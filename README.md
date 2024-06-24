# Back-To-Basic-Spring
SpringBoot 개념부터 다시 시작하기 프로젝트

<br>

## 참고자료
[스프링부트 핵심 가이드(위키북스, 장정우 지음)](https://m.yes24.com/Goods/Detail/110142898)

<br>

## 교재 참고 Github Repository
[https://github.com/wikibook/springboot](https://github.com/wikibook/springboot)

<br>


## 현재 진행상황
### CH6. 데이터베이스 연동 ing

---

#### 1️⃣ 상품 정보 저장: POST API
  - 🚀error🚀
    ```java
    com.fasterxml.jackson.databind.exc.InvalidDefinitionException: Cannot construct instance of com.springboot.api.data.dto.ProductDTO (no Creators, like default constructor, exist): cannot deserialize from Object value (no delegate- or property-based Creator)
     at [Source: (org.springframework.util.StreamUtils$NonClosingInputStream); line: 2, column: 3]
    ```
    - 해결: ProductDTO의 기본 생성자 지정
      ```java
      package com.springboot.api.data.dto;
      
      public class ProductDTO {
      
          private String name;
          private int price;
          private int stock;
      
          public ProductDTO(){
          }
      
      ...
      ```
        
    ![image](https://github.com/hayannn/Back-To-Basic-Spring/assets/102213509/fab71a81-81ed-4e09-b619-8af6a4aae5d3)
  ![image](https://github.com/hayannn/Back-To-Basic-Spring/assets/102213509/06c6ae96-f17c-4a2b-b43f-3f44b96636cd)
  ![image](https://github.com/hayannn/Back-To-Basic-Spring/assets/102213509/c3ad7e40-85bd-4465-9bcf-abcdefcfb18a)
  ![image](https://github.com/hayannn/Back-To-Basic-Spring/assets/102213509/afdaa08a-cd54-4d9e-a393-a1d248f53e19)

---

<br>

---

#### 2️⃣ 상품 조회: GET API
  ![image](https://github.com/hayannn/Back-To-Basic-Spring/assets/102213509/bb21aaa7-3eb4-46af-ab75-578aa1057b85)
  ![image](https://github.com/hayannn/Back-To-Basic-Spring/assets/102213509/1c5d0bf4-eee4-42e5-8b83-e93f18f897e3)

---

<br>

---

#### 3️⃣ 상품 이름 변경: PUT API
  ![image](https://github.com/hayannn/Back-To-Basic-Spring/assets/102213509/e51f7212-359e-4f2c-9cb2-090accb60a92)
  ![image](https://github.com/hayannn/Back-To-Basic-Spring/assets/102213509/2e634ca5-d7ae-40b2-b7e5-2b61d7785b84)
  ![image](https://github.com/hayannn/Back-To-Basic-Spring/assets/102213509/a658a99a-5771-4f8c-a559-a2fe1aeb299b)

---

<br>

---

#### 4️⃣ 상품정보 삭제: DELETE API
  -  🚀Swagger 출력 한글 깨짐 현상 해결🚀: DeleteMapping에 produces로 UTF-8 설정
  ```java
  // ProductController.java
  
  ...
  
  @DeleteMapping(produces = "text/plain;charset=UTF-8")
  
  ...
  
  ```
    
  ![image](https://github.com/hayannn/Back-To-Basic-Spring/assets/102213509/8af51f8e-f3a2-43ff-988a-dde7c4e2d5e9)
    
  ![image](https://github.com/hayannn/Back-To-Basic-Spring/assets/102213509/0063956d-d795-4154-b1b4-52155f12e0ab)
  ![image](https://github.com/hayannn/Back-To-Basic-Spring/assets/102213509/3b646bab-913c-43de-b00b-d991cc09e324)

---

<br>

## commit message convention
- feat: 새로운 기능 추가
- fix: 버그 수정
- docs: 문서
- style: 포맷팅, 누락된 세미콜론 등
- refactor: 코드 리팩토링
- test: 테스트 관련
- chore: 기타 수정
- build: 빌드 시스템 또는 외부 의존성에 영향을 주는 변경
- remove: 파일을 삭제

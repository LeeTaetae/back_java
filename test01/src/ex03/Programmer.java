package ex03;
//※ 요구 사항
//- 메서드
//    ex) a) 메서드명
//        - 기능
//a) registerLanguages
//    - 언어를 받으면 5칸 짜리 배열 안에 언어들이 추가 되는 메서드이다.
//    단 배열에 전달된 값이 이미 있다면 추가되지 않는다. 즉 중복값을 허용하지 않는다.
//    또한 5칸을 초과하지 않으며 5개 이상의 값을 넘기면 앞에서부터 5개가 추가된다.
//b) showLanguages
//    - 자신이 가진 언어들을 모두 출력해서 보여주는 메서드이다.
//    출력 예시) C Java Python
//c) changeLanguage
//    - 2개의 매개변수(찾을 값, 변경할 값)를 받아서 찾은 위치에 변경할 값을 집어넣어 수정해주는 메서드이다.
//    단, 찾을 값이 없다면 아무것도 수행하지 않는다.
//    만약 변경이 성공했다면 true, 변경에 실패했다면 false로 리턴하며, 자신이 가진 showLanguages를 호출한다.
public class Programmer extends Person {
//- 필드: 노트북(notebook) - 논리형, 언어들(languages) - 문자열 5칸 짜리 배열
   private boolean notebook;
   private String[] lanugages;
   
   public Programmer(String name, int age, String job, String hobby,
         boolean notebook, String[] lanugages) {
      super(name, age, job, hobby);
      this.notebook = notebook;
      this.lanugages = lanugages;
   }

   public boolean isNotebook() {
      return notebook;
   }

   public void setNotebook(boolean notebook) {
      this.notebook = notebook;
   }

   public String[] getLanugages() {
      return lanugages;
   }

   public void setLanugages(String[] lanugages) {
      this.lanugages = lanugages;
   }
   

}

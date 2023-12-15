package class1;

public class ClassStart1 {
    public static void main(String[] args) {
        //학생 정보 출력 프로그램 만들기
        //배열로 처리하면 쉽지만 데이터가 쌓였을 때 학생 한명을 삭제해야한다면
        //3개의 배열을 다 수정해줘야함. 이럴 때 필요한게 클래스의 도입
        String[] studentNames = {"학생1" , "학생2"};
        int[] studentAges = {15 , 16};
        int[] studentGrade = {90 , 80};

        for (int i = 0; i < studentNames.length; i++) {
            System.out.println("이름 : " + studentNames[i] + "나이 : " + studentAges[i] + "성적 : " + studentGrade[i]);
        }
    }
}

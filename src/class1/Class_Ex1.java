package class1;

public class Class_Ex1 {
    public static void main(String[] args) {
        // 영화 리뷰 관리하기1
        Class_Ex1_MovieReview inception = new Class_Ex1_MovieReview();
        inception.title = "inception";
        inception.review="인생은 무한 루프.";

        Class_Ex1_MovieReview aboutTime = new Class_Ex1_MovieReview();
        aboutTime.title = "aboutTime";
        aboutTime.review="인생 시간 영화";

        Class_Ex1_MovieReview[] movieReviews = {inception, aboutTime};

        for ( Class_Ex1_MovieReview m : movieReviews) {
            System.out.println("영화 타이틀 : " + m.title + ", 영화 리뷰 : " + m.review);
        }


    }
}

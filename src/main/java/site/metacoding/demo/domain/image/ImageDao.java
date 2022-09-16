package site.metacoding.demo.domain.image;

public interface ImageDao {
    public void save(String imageName, String imagePath); // 이미지 저장
    public void findById(); // 꺼낼 때 필요
}

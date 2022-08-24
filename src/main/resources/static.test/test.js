var arr = [];

var title_ = [u1, u2, u3];
var start_ = [1, 2, 3];

var event = {}




arr = [

];

// 구성 event(키): (값-배열)[ {객체1}, {객체2}, .... ];
// 원하는 거 : 값배열 []에 객체 1, 2, .. 를 반복문으로 넣기

// 로직
// 객체 1, 2, ... 을 배열로 받아서
// event:[값]에 넣기


var list = [];
for(var j=0; j<10;j++){
    list[j]={title:title_[j], start:start_[j]};
}

// 만들어진 리스트를 가 event(키)의 벨류
// 즉, title_[i] 와 start_[j]를 타임리프로 받아오면 됨

// 컨트룰러에서 addAttribute로 "값이름" 에 담아서 데이터를 넘김으로
// 그걸 리스트에 담고, for문을 통해 불러주면 됨
// https://blog.naver.com/PostView.naver?blogId=entekk1111&logNo=222426737823&parentCategoryNo=&categoryNo=1&viewDate=&isShowPopularPosts=true&from=search
// 왜 맵을 썼는지 모르겠지만 참고해서 로직 짜보기

// 그리고 궁극적으로 원하는 건 일단 위에 db 연동이 되고 나면
// title과 picture를 받아서 사진을 칸 안에 넣는 기능을 구현하고 싶음

// => 하고 나면 백그라운드 변경하는 공식문서 찾아서 색 변경하는 걸 백그라운드로 바꿔주면 될 듯 ;

// https://fullcalendar.io/docs/event-source-object 백그라운드 이미지를 변경할 순 없나, 색상밖에 안 나옴
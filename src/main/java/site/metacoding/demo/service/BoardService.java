package site.metacoding.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import site.metacoding.demo.entity.Board;
import site.metacoding.demo.boardRepository.BoardRepository;
import site.metacoding.demo.dto.BoardDto;

import java.io.File;
import java.io.IOException;
import java.nio.channels.MulticastChannel;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class BoardService {
    @Autowired
    BoardRepository boardRepository;

    public Board findById(Integer id) {
        Optional<Board> board = boardRepository.findById(id);
        if (board.isPresent()) {
            return board.get();
        } else {
            return null;

        }
    }
    public List<Board> findAll(){
        return boardRepository.findAll();
    }

    public Board insert(Board board, MultipartFile file) throws IOException {
//        Board b = new Board();
//        b.setTitle(board.getTitle());
//        b.setContent(board.getContent());
//        b.setPic(board.getPic());

        String imagePath = System.getProperty("D:\\javaStudy\\boardPractice\\src\\main\\resources\\static\\files"); // 지금 프로젝트 경로 담기
        UUID uuid = UUID.randomUUID(); // 식별자, 렌덤 아이디
        String fileName = uuid +"_"+file.getOriginalFilename();
        File saveFile = new File(imagePath, fileName);
        file.transferTo(saveFile);
        board.setPic(fileName);
        board.setPicPath(imagePath);

        return boardRepository.save(board);
    }
    public long saveImage(BoardDto boardDto){
        return boardRepository.save(boardDto.toEntity()).getId();
    }
}

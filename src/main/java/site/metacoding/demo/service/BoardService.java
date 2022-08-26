package site.metacoding.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import site.metacoding.demo.board.Board;
import site.metacoding.demo.boardRepository.BoardRepository;

import java.util.List;
import java.util.Optional;

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

    public Board insert(Board board){
        return boardRepository.save(board);
    }
}

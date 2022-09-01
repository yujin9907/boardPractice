package site.metacoding.demo.domain;

import site.metacoding.demo.web.dto.req.FormDto;

import java.util.List;

public interface BoardDao {
    public void insert(FormDto formDto);
    public List<Board> findAll();
}

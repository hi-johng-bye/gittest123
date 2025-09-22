//package com.semo.DTO;
//
//import lombok.Data;
//import org.springframework.data.domain.Page;
//import org.springframework.data.domain.Pageable;
//
//import java.util.List;
//import java.util.function.Function;
//import java.util.stream.Collectors;
//import java.util.stream.IntStream;
//
//@Data
//
//public class PageResultDTO<DTO, EN> {
//  private List<DTO> dtoList;
//  private int totalPage;
//  private int page;
//  private int size;
//  private int start, end;
//  private boolean prev, next;
//  private List<Integer> pageList;
//
//  public PageResultDTO(Page<EN> page, Function<EN, DTO> fn) {
//
//
//    dtoList = page.stream().map(fn).collect(Collectors.toList());
//
//
//    totalPage = page.getTotalPages();
//
//
//    makePageInfo(page.getPageable());
//  }
//
//  private void makePageInfo(Pageable pageable) {
//    page = pageable.getPageNumber() + 1;
//    size = pageable.getPageSize();
//    //페이지네이션의 시작 번호
//    int tempEnd = (int)(Math.ceil(page/10.0))*10;
//    start = tempEnd - 9;
//    //계산상 끝페이지가 실제총페이보다 작으면 계산상 끝페이지를 페이지네이션 끝페이지가 됨.
//    prev = start > 1;
//    end = tempEnd < totalPage ? tempEnd : totalPage;
//    next = tempEnd < totalPage;
//    //페이지 번호 목록
//    pageList = IntStream.rangeClosed(start, end).boxed().collect(Collectors.toList());
//  }
//
//}

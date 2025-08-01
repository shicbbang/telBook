package service;

import dto.TelDto;

import java.util.List;

public interface CrudInterface {
    int insertData(TelDto dto);

    int UpdateData(TelDto dto);

    int deleteData(int Id);

    List<TelDto> getListAll(); //전체 찾기

    TelDto findById(int Id); //한 개 데이터 찾기

    List<TelDto> searchList(String keyword); //이름 검색


}

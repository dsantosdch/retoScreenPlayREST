package models.dataSet;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.cucumber.datatable.DataTable;
import models.ModelCreateUserRest;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class SetModelCreateUserRest {

    public List<ModelCreateUserRest> setData(DataTable datatable){
        List<ModelCreateUserRest> dates = new ArrayList<>();
        List<Map<String,String>>  mapInfo = datatable.asMaps();
        for(Map<String,String> map : mapInfo){
            dates.add(new ObjectMapper().convertValue(map, ModelCreateUserRest.class));
        }
        return dates;
    }

}

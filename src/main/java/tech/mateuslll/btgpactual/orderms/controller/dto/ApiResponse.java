package tech.mateuslll.btgpactual.orderms.controller.dto;

import java.util.List;
import java.util.Map;

//<>T recebe qualquer objeto
public record ApiResponse<T>(Map<String, Object> summary, List<T> data, PaginationResponse  paginationResponse) {
}

package com.qingcheng.service.order;

import java.util.List;
import java.util.Map;

public interface CartService {
    public List<Map<String, Object>> findCartList(String username);
}

package cn.cyejing.dam.core.config;

import cn.cyejing.dam.common.config.Instance;
import cn.cyejing.dam.common.config.Route;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Data
public class RouteConfig {

    private List<Route> routes;
    private List<Instance> instances;

    public RouteConfig() {
    }
}

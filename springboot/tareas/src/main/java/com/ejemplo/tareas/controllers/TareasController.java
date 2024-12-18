package com.ejemplo.tareas.controllers;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


@RestController
@RequestMapping("/tareas")
public class TareasController {
    private List<String> tareas = new ArrayList<>();
    @GetMapping
    public List<String> getTareas(){
        return tareas;
    }
    @GetMapping("/{index}")
    public String getIndexTareas(@PathVariable int index){
        if (index >= 0 && index < tareas.size()) {
            return String.format("tarea %s con index %d",tareas.get(index),index);
        }
        return "index incorrecto";
    }

    @PostMapping
    public String addTarea (@RequestBody String tarea){
        tareas.add(tarea);
        return String.format("se ha añadido la tarea %s con index %d",tarea,tareas.size()-1);
    }
    @DeleteMapping("/{index}")
    public String deleteTarea (@PathVariable int index) {
        if (index >= 0 && index < tareas.size()) {

            String tareaEliminada = tareas.remove(index);
            return String.format("se ha eliminado la tarea %s con index %d",tareaEliminada,index);
        }
        return "index incorrecto";
    }
}

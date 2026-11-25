package com.yeirel.stonesolutions.Repository;

import com.yeirel.stonesolutions.entidades.Material;
import com.yeirel.stonesolutions.entidades.Proyecto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProyectosRepository extends JpaRepository<Proyecto,Long> {
}

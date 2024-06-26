package pl.scrumsystem.zakladfryzjerski.repository;

import pl.scrumsystem.zakladfryzjerski.entity.Equipment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EquipmentRepository extends JpaRepository<Equipment, Long>
{
    List<Equipment> findByCond(String cond);


}



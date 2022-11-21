package PedidoAPI.API.Repository;

import PedidoAPI.API.entity.Itens;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItensRepository extends JpaRepository<Itens, Long>{
}

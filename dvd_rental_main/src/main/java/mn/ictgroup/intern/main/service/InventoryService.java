package mn.ictgroup.intern.main.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mn.ictgroup.intern.main.entity.Inventory;
import mn.ictgroup.intern.main.repository.InventoryRepository;

/**
 * 
 * @author B.Nyamkhuu
 *
 */
@Service
public class InventoryService {

	@Autowired
	private InventoryRepository inventoryRepo;

	public List<Inventory> getInventoriesByFilmId(Long filmId) {
		return this.inventoryRepo.findByFilmId(filmId);
	}
}

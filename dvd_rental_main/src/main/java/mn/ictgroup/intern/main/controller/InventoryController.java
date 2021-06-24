package mn.ictgroup.intern.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import mn.ictgroup.intern.main.entity.Inventory;
import mn.ictgroup.intern.main.service.InventoryService;

/**
 * 
 * @author B.Nyamkhuu
 *
 */

@RestController
@RequestMapping("/inventory")
public class InventoryController {

	@Autowired
	private InventoryService inventoryService;
	
	@GetMapping()
	public List<Inventory> getInventoriesByFilmId(@RequestParam Long filmId) {
		return this.inventoryService.getInventoriesByFilmId(filmId);
	}
}

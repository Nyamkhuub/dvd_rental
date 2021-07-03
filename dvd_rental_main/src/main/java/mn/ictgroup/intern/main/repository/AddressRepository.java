package mn.ictgroup.intern.main.repository;

import mn.ictgroup.intern.main.entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface AddressRepository extends JpaRepository<Address, Long> {
    List<Address> findByAddressId(Long addressId);

    Optional<Address> findAddressByAddress(Long address);

    void deleteByAddressId(Long addressId);
}

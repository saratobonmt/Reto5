package co.usa.ciclo3.ciclo3.repository;

import co.usa.ciclo3.ciclo3.model.Reservation;
import co.usa.ciclo3.ciclo3.repository.crud.ReservationCrudRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@Repository
public class ReservationRepository {

	@Autowired
	private ReservationCrudRepository reservationCrudRepository;

	public List<Reservation> getAll() {
		return (List<Reservation>) reservationCrudRepository.findAll();
	}

	public List<Reservation> getByDate(Date date1, Date date2) {
		return (List<Reservation>) reservationCrudRepository.reservationByDate(date1, date2);
	}

	public Optional<Reservation> getReservation(Integer id) {
		return reservationCrudRepository.findById(id);
	}

	public Reservation save(Reservation reservation) {
		return reservationCrudRepository.save(reservation);
	}

	public void deteteReservationById(int idReservation) {
		reservationCrudRepository.deleteById(idReservation);
	}

	public List<String> reservtionStatus() {
		return reservationCrudRepository.reservationStatus();
	}

	public List<Map<Object, Object>> reservtionClient() {
		return reservationCrudRepository.reservationClient();
	}
}

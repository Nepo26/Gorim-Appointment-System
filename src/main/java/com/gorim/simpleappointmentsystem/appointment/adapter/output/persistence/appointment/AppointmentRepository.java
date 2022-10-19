package com.gorim.simpleappointmentsystem.appointment.adapter.output.persistence.appointment;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AppointmentRepository extends ReactiveMongoRepository<AppointmentEntity, String> {
}

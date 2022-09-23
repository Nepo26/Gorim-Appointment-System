package com.gorim.simpleappointmentsystem.appointment.adapter.output.persistence.appointment;

import org.bson.types.ObjectId;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AppointmentRepository extends ReactiveCrudRepository<AppointmentEntity, ObjectId> {
}

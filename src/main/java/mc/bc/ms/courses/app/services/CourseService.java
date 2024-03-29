package mc.bc.ms.courses.app.services;

import java.util.Map;

import mc.bc.ms.courses.app.models.Course;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface CourseService {
	
	public Mono<Map<String, Object>> saveCourse(Course course); 
	
	public Flux<Course> findAllCourse();
	
	public Mono<Course> findIdCourse(String id);
	
	public Mono<Map<String, Object>> updateCourse(String id, Course course);
	
	public Mono<Map<String, Object>> deleteCourses(String id);
	
	public Flux<Course> findAllInstituteCourse(String institute);
	
	public Flux<Course> findTeacher(String teacher, String institute);

}

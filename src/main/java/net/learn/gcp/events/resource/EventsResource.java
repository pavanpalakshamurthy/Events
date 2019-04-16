/**
 * 
 */
package net.learn.gcp.events.resource;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.learn.gcp.events.domain.Event;

/**
 * @author pavan
 *
 */

@RestController
@RequestMapping("events")
public class EventsResource {

	@GetMapping("/list")
	public List<Event> listEvents() {
		return Arrays.asList(new Event("12345", "Spring boot meetup", new Date()));
	}

}

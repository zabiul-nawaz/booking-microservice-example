var xhr = new XMLHttpRequest();
xhr.open('GET', 'http://localhost:9990/flights', true);
xhr.onload = function () {
  var data = JSON.parse(this.response);
  if (xhr.status >= 200 && xhr.status < 400) {

    var flightsTable= "<table><tr><td style='width: 100px; color: red; text-align: centre;'>Airlines</td>";
    flightsTable+= "<td style='width: 100px; color: red; text-align: centre;'>Source</td>";
    flightsTable+= "<td style='width: 100px; color: red; text-align: centre;'>Destination</td>";
    flightsTable+= "<td style='width: 100px; color: red; text-align: centre;'>Departure</td>";
    flightsTable+="<td style='width: 100px; color: red; text-align: centre;'>Available Seats</td></tr>";

    flightsTable+="<tr><td style='width: 100px;                   '>---------------</td>";
    flightsTable+="<td     style='width: 100px; text-align: centre;'>---------------</td>";
    flightsTable+="<td     style='width: 100px; text-align: centre;'>---------------</td>";
    flightsTable+="<td     style='width: 250px; text-align: centre;'>-----------------------------------------</td>";
    flightsTable+="<td     style='width: 100px; text-align: centre;'>---------------</td></tr>";

    data.forEach(flight => {
      flightsTable+="<tr><td style='width: 100px; text-align: centre;'>" + flight.airlines + "</td>";
      flightsTable+="<td style='width: 100px; text-align: centre;'>" + flight.source + "</td>";
      flightsTable+="<td style='width: 100px; text-align: centre;'>" + flight.destination + "</td>";
      flightsTable+="<td style='width: 250px; text-align: centre;'>  " + flight.departure + "  </td>";
      flightsTable+="<td style='width: 100px; text-align: centre;'>" + flight.availableSeats + "</td></tr>";
    });
    flightsTable+="</table>";
    document.write(flightsTable);
  } else {
    document.write("something is wrong ...");
  }
}

xhr.send();

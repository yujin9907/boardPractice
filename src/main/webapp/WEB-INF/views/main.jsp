<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ include file="layout/header.jsp"%>
<script>

    document.addEventListener('DOMContentLoaded', function() {
        var calendarEl = document.getElementById('calendar');
        var calendar = new FullCalendar.Calendar(calendarEl, {
            initialView: 'dayGridMonth'
        });
        calendar.render();
    });

</script>
    <style>

        html, body {

            font-family: Arial, Helvetica Neue, Helvetica, sans-serif;
            font-size: 14px;
        }

        #calendar-container {
            position: relative;
            top: 0;
            left: 0;
            right: 0;
            bottom: 0;
            margin-bottom: 10%;
        }

        .fc-header-toolbar {
            /*
            the calendar will be butting up against the edges,
            but let's scoot in the header's buttons
            */
            padding-top: 1em;
            padding-left: 1em;
            padding-right: 1em;
        }

    </style>


    <div id='calendar'></div>
</div>
<%@ include file="layout/footer.jsp" %>









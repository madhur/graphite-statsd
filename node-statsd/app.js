const express = require("express");
const app = express();

const StatsD = require("node-statsd"),
    client = new StatsD();

app.get("/", (req, res) => {
    res.send("Response from a simple GET API");

    client.increment("api_counter");

    client.timing("api_response_time", 110);
});

app.listen(3000, () => {
    console.log("Node server started on port 3000");
});

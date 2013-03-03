#pragma strict

var speed : float = 10;
var lifeTime : float = 0.5;
var dist : float = 10000;

private var spawnTime : float = 0.0;
private var tr : Transform;


function OnEnable () {
	tr = transform;
	spawnTime = Time.time;
}

function Update () {
	tr.position += tr.forward * speed * Time.deltaTime;
	dist -= speed * Time.deltaTime;
	if (Time.time > spawnTime + lifeTime || dist < 0) {
		Spawner.Destroy (gameObject);
	}
}

/*
function Start () {
   bulletCount++;
   var form = new WWWForm();
   form.AddField("Accept:", "application/json");
   form.AddField("Content-type:", "application/json");
   form.AddField("Content-Length:", "0");
   var download = new WWW("http://limitless-stream-3996.herokuapp.com/profiles/1/Bullet/" + bulletCount + ".json", form);
   yield download;
   print(download.isDone);
   if(download.error) {
      print("Error downloading" + download.error);
      return;
   } else {
      print("Result " + download.text);
   }

}*/
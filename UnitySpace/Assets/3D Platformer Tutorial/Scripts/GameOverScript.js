function LateUpdate ()
{
if (!audio.isPlaying || Input.anyKeyDown)
Application.LoadLevel("StartMenu");
}
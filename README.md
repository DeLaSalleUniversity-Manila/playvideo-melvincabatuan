# Play Video

playvideo-melvincabatuan created by Classroom for GitHub

This assignment illustrates how to use play video. 


## Accept

To accept the assignment, click the following URL:

https://classroom.github.com/assignment-invitations/a606da6c909198e7af314921e2824614

## Sample Solution:

https://github.com/DeLaSalleUniversity-Manila/playvideo-melvincabatuan

## Keypoint

```java
private void playVideo(){
        VideoView videoview = (VideoView) findViewById(R.id.video);
        videoview.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.lovestory));
        videoview.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {

            @Override
            public void onPrepared(MediaPlayer mp) {
                mp.start();
            }
        });
    }
```

## Submission Procedure with Git: 

```shell
$ cd /path/to/your/android/app/
$ git init
$ git add –all
$ git commit -m "your message, e.x. Assignment 1 submission"
$ git remote add origin <Assignment link copied from assignment github, e.x. https://github.com/DeLaSalleUniversity-Manila/secondactivityassignment-melvincabatuan.git>
$ git push -u origin master
<then Enter Username and Password>
```


## Screenshot:

![alt tag](https://github.com/DeLaSalleUniversity-Manila/playvideo-melvincabatuan/blob/master/device-2015-10-18-164443.png)

![alt tag](https://github.com/DeLaSalleUniversity-Manila/playvideo-melvincabatuan/blob/master/device-2015-10-18-164501.png)

![alt tag](https://github.com/DeLaSalleUniversity-Manila/playvideo-melvincabatuan/blob/master/device-2015-10-18-164610.png)

![alt tag](https://github.com/DeLaSalleUniversity-Manila/playvideo-melvincabatuan/blob/master/device-2015-10-18-164631.png)

![alt tag](https://github.com/DeLaSalleUniversity-Manila/playvideo-melvincabatuan/blob/master/device-2015-10-18-164717.png)

![alt tag](https://github.com/DeLaSalleUniversity-Manila/playvideo-melvincabatuan/blob/master/device-2015-10-18-164754.png)

![alt tag](https://github.com/DeLaSalleUniversity-Manila/playvideo-melvincabatuan/blob/master/device-2015-10-18-165000.png)

![alt tag](https://github.com/DeLaSalleUniversity-Manila/playvideo-melvincabatuan/blob/master/device-2015-10-18-165040.png)

"*Flight from boredom is the mother of all art.*" - Friedrich Nietzsche

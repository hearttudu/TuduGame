package com.example.dadishu_module;

import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by Tudu.Zhao
 * on 2019/9/2
 **/
public class DaDiShuGameFragment extends Fragment implements View.OnClickListener {

    private String progress = "0%";
    private String life = "❤❤❤❤❤❤❤❤❤❤100%";
    private String strs = "";
    private boolean isPause = true, sfdj = false;
    private boolean run = false;
    private Button btn1, btn2;
    private TextView scoreTv, progressTv, lifeTv, barrierTv;
    private ImageView img0, img1, img2, img3, img4, img5, img6, img7, img8, img9, img10, img11, img12, img13, img14, img15;
    private int num, td = 8, tt = 0, tdtime = 360, fen = 0, wcd = 0, smz = 100, dj = 1, i = 0;
    private Handler handler = new Handler();
    private ImageView[] imgArray;

    private Runnable task = new Runnable() {

        public void run() {
            // TODO Auto-generated method stub
            if (run) {
                handler.postDelayed(this, tdtime);
                if (smz <= 0) {
                    run = false;
                    handler.post(task);
                    Toast.makeText(getActivity(), "游戏结束", Toast.LENGTH_SHORT).show();
                }
                if (tt == td) {
                    num = (int) (Math.random() * 16);
                    tt = 0;
                    imggb(num);

                }
                tt++;
                if (smz >= 10) {
                    smz = 10;
                }

                strs = "";
                for (i = 0; i < smz; i++) {
                    strs = strs + "❤";
                }
                life = strs + smz;

                progress = 2 * wcd / dj + "%";

                if (wcd >= 50 * dj) {
                    tdtime = tdtime * 81 / 100;
                    dj++;
                    wcd = 0;
                    smz = 10;
                }
            }

            scoreTv.setText("得分: " + fen);
            barrierTv.setText("关卡：" + dj);
            lifeTv.setText("生命：" + life);
            progressTv.setText("进度：" + progress);

        }
    };

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_dadishu_game, container, false);
        initView(view);
        return view;
    }

    private void initView(View view) {

        img0 = view.findViewById(R.id.img0);
        img1 = view.findViewById(R.id.img1);
        img2 = view.findViewById(R.id.img2);
        img3 = view.findViewById(R.id.img3);
        img4 = view.findViewById(R.id.img4);
        img5 = view.findViewById(R.id.img5);
        img6 = view.findViewById(R.id.img6);
        img7 = view.findViewById(R.id.img7);
        img8 = view.findViewById(R.id.img8);
        img9 = view.findViewById(R.id.img9);
        img10 = view.findViewById(R.id.img10);
        img11 = view.findViewById(R.id.img11);
        img12 = view.findViewById(R.id.img12);
        img13 = view.findViewById(R.id.img13);
        img14 = view.findViewById(R.id.img14);
        img15 = view.findViewById(R.id.img15);

        imgArray = new ImageView[]{img0, img1, img2, img3, img4, img5, img6, img7, img8, img9, img10, img11, img12, img13, img14, img15};

        for (int i = 0; i < imgArray.length; i++) {
            imgArray[i].setOnClickListener(this);
        }

        btn1 = view.findViewById(R.id.btn1);
        btn2 = view.findViewById(R.id.btn2);
        scoreTv = view.findViewById(R.id.score);
        lifeTv = view.findViewById(R.id.life);
        progressTv = view.findViewById(R.id.progress);
        barrierTv = view.findViewById(R.id.barrier);

        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
    }

    public void imggb(int num) {

        if (num == -1) {
            for (int i = 0; i < imgArray.length; i++) {
                imgArray[i].setImageResource(R.drawable.meng);
            }
        }
        for (int i = 0; i < imgArray.length; i++) {
            if (num == i) {
                imgArray[i].setImageResource(R.drawable.img_ds);
                sfdj = true;
            } else {
                imgArray[i].setImageResource(R.drawable.meng);
            }
        }
    }

    @Override
    public void onClick(View v) {
        int id = v.getId();
        if (id == R.id.img0) {
            if (num == 0) {
                if (sfdj) {
                    fen = fen + 10;
                    sfdj = false;
                    smz = smz + 1;
                    wcd = wcd + 10;
                    img0.setImageDrawable(getResources().getDrawable(
                            R.drawable.meng));
                }
            } else {
                fen = fen - 5;
                smz = smz - 1;
            }
        } else if (id == R.id.img1) {
            if (num == 1) {
                if (sfdj) {
                    fen = fen + 10;
                    sfdj = false;
                    smz = smz + 1;
                    wcd = wcd + 10;
                    img1.setImageDrawable(getResources().getDrawable(
                            R.drawable.meng));
                }
            } else {
                fen = fen - 5;
                smz = smz - 1;
            }
        } else if (id == R.id.img2) {
            if (num == 2) {
                if (sfdj) {
                    fen = fen + 10;
                    sfdj = false;
                    smz = smz + 1;
                    wcd = wcd + 10;
                    img2.setImageDrawable(getResources().getDrawable(
                            R.drawable.meng));
                }
            } else {
                fen = fen - 5;
                smz = smz - 1;
            }
        } else if (id == R.id.img3) {
            if (num == 3) {
                if (sfdj) {
                    fen = fen + 10;
                    sfdj = false;
                    smz = smz + 1;
                    wcd = wcd + 10;
                    img3.setImageDrawable(getResources().getDrawable(
                            R.drawable.meng));
                }
            } else {
                fen = fen - 5;
                smz = smz - 1;
            }
        } else if (id == R.id.img4) {
            if (num == 4) {
                if (sfdj) {
                    fen = fen + 10;
                    sfdj = false;
                    smz = smz + 1;
                    wcd = wcd + 10;
                    img4.setImageDrawable(getResources().getDrawable(
                            R.drawable.meng));
                }
            } else {
                fen = fen - 5;
                smz = smz - 1;
            }
        } else if (id == R.id.img5) {
            if (num == 5) {
                if (sfdj) {
                    fen = fen + 10;
                    sfdj = false;
                    smz = smz + 1;
                    wcd = wcd + 10;
                    img5.setImageDrawable(getResources().getDrawable(
                            R.drawable.meng));
                }
            } else {
                fen = fen - 5;
                smz = smz - 1;
            }
        } else if (id == R.id.img6) {
            if (num == 6) {
                if (sfdj) {
                    fen = fen + 10;
                    sfdj = false;
                    smz = smz + 1;
                    wcd = wcd + 10;
                    img6.setImageDrawable(getResources().getDrawable(
                            R.drawable.meng));
                }
            } else {
                fen = fen - 5;
                smz = smz - 1;
            }
        } else if (id == R.id.img7) {
            if (num == 7) {
                if (sfdj) {
                    fen = fen + 10;
                    sfdj = false;
                    smz = smz + 1;
                    wcd = wcd + 10;
                    img7.setImageDrawable(getResources().getDrawable(
                            R.drawable.meng));
                }
            } else {
                fen = fen - 5;
                smz = smz - 1;
            }
        } else if (id == R.id.img8) {
            if (num == 8) {
                if (sfdj) {
                    fen = fen + 10;
                    sfdj = false;
                    smz = smz + 1;
                    wcd = wcd + 10;
                    img8.setImageDrawable(getResources().getDrawable(
                            R.drawable.meng));
                }
            } else {
                fen = fen - 5;
                smz = smz - 1;
            }
        } else if (id == R.id.img9) {
            if (num == 9) {
                if (sfdj) {
                    fen = fen + 10;
                    sfdj = false;
                    smz = smz + 1;
                    wcd = wcd + 10;
                    img9.setImageDrawable(getResources().getDrawable(
                            R.drawable.meng));
                }
            } else {
                fen = fen - 5;
                smz = smz - 1;
            }
        } else if (id == R.id.img10) {
            if (num == 10) {
                if (sfdj) {
                    fen = fen + 10;
                    sfdj = false;
                    smz = smz + 1;
                    wcd = wcd + 10;
                    img10.setImageDrawable(getResources().getDrawable(
                            R.drawable.meng));
                }
            } else {
                fen = fen - 5;
                smz = smz - 1;
            }
        } else if (id == R.id.img11) {
            if (num == 11) {
                if (sfdj) {
                    fen = fen + 10;
                    sfdj = false;
                    smz = smz + 1;
                    wcd = wcd + 10;
                    img11.setImageDrawable(getResources().getDrawable(
                            R.drawable.meng));
                }
            } else {
                fen = fen - 5;
                smz = smz - 1;
            }
        } else if (id == R.id.img12) {
            if (num == 12) {
                if (sfdj) {
                    fen = fen + 10;
                    sfdj = false;
                    smz = smz + 1;
                    wcd = wcd + 10;
                    img12.setImageDrawable(getResources().getDrawable(
                            R.drawable.meng));
                }
            } else {
                fen = fen - 5;
                smz = smz - 1;
            }
        } else if (id == R.id.img13) {
            if (num == 13) {
                if (sfdj) {
                    fen = fen + 10;
                    sfdj = false;
                    smz = smz + 1;
                    wcd = wcd + 10;
                    img13.setImageDrawable(getResources().getDrawable(
                            R.drawable.meng));
                }
            } else {
                fen = fen - 5;
                smz = smz - 1;
            }
        } else if (id == R.id.img14) {
            if (num == 14) {
                if (sfdj) {
                    fen = fen + 10;
                    sfdj = false;
                    smz = smz + 1;
                    wcd = wcd + 10;
                    img14.setImageDrawable(getResources().getDrawable(
                            R.drawable.meng));
                }
            } else {
                fen = fen - 5;
                smz = smz - 1;
            }
        } else if (id == R.id.img15) {
            if (num == 15) {
                if (sfdj) {
                    fen = fen + 10;
                    sfdj = false;
                    smz = smz + 1;
                    wcd = wcd + 10;
                    img15.setImageDrawable(getResources().getDrawable(
                            R.drawable.meng));
                }
            } else {
                fen = fen - 5;
                smz = smz - 1;
            }
        } else if (id == R.id.btn1) {
            if (smz <= 0) {
                num = -1;
                td = 8;
                tt = 0;
                tdtime = 360;
                fen = 0;
                wcd = 0;
                smz = 10;
                dj = 1;
                isPause = true;
                sfdj = false;
                imggb(num);
                isPause = false;
                run = true;
                handler.postDelayed(task, 1000);
                btn1.setText("开始");
            } else {
                if (isPause) {
                    isPause = false;
                    run = true;
                    handler.post(task);
                    btn1.setText("暂停");
                } else {
                    isPause = true;
                    run = false;
                    handler.postDelayed(task, 1000);
                    btn1.setText("开始");
                }
            }
        } else {
            getActivity().finish();
        }
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        if (handler != null) {
            handler.removeCallbacks(task);
        }
    }
}

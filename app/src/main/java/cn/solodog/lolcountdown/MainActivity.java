package cn.solodog.lolcountdown;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.PopupMenu;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {
    private static final String TAG = MainActivity.class.getSimpleName();
    private long clickTime = 0; //记录第一次点击的时间
    private Button btab1;
    private Button btab2;
    private Button btab3;
    private Button btab4;
    private Button btab5;
    private Button btab6;
    private Button btab7;
    private Button btab8;
    private Button btab9;
    private Button btab10;
    private TextView stop1;
    private TextView stop2;
    private TextView stop3;
    private TextView stop4;
    private TextView stop5;
    private PopupMenu popab1 = null;
    private PopupMenu popab2 = null;
    private PopupMenu popab3 = null;
    private PopupMenu popab4 = null;
    private PopupMenu popab5 = null;
    private PopupMenu popab6 = null;
    private PopupMenu popab7 = null;
    private PopupMenu popab8 = null;
    private PopupMenu popab9 = null;
    private PopupMenu popab10 = null;
    private CountDownTimer cdtime1;
    private CountDownTimer cdtime2;
    private CountDownTimer cdtime3;
    private CountDownTimer cdtime4;
    private CountDownTimer cdtime5;
    private CountDownTimer cdtime6;
    private CountDownTimer cdtime7;
    private CountDownTimer cdtime8;
    private CountDownTimer cdtime9;
    private CountDownTimer cdtime10;

    private MediaPlayer timeup;//结束计时，在每个CountDownTimer的Finish中播放。

    public class MenuItemClick {//筛选选中哪个技能，并且是点击了哪个按钮，根据按钮分配CountDownTimer。
        private MenuItem item;//选择技能
        private Button btM;//按钮
        private int abtime;//技能时间
        private CountDownTimer cdB;//计时器

        public void OnMenuItemClick(MenuItem item, final Button bt) {
            this.item = item;
            this.btM = bt;
            switch (item.getItemId()) {
                case R.id.menuabFlash:
                    bt.setText("");
                    bt.setTextSize(35);
                    bt.setBackgroundResource(R.drawable.menu_flash1);
                    abtime = 300000;
                    break;
                case R.id.menuabHeal:
                    bt.setText("");
                    bt.setTextSize(35);
                    bt.setBackgroundResource(R.drawable.menu_heal1);
                    abtime = 240000;
                    break;
                case R.id.menuabTeleport:
                    bt.setText("");
                    bt.setTextSize(35);
                    bt.setBackgroundResource(R.drawable.menu_teleport1);
                    abtime = 300000;
                    break;
                case R.id.menuabDot:
                    bt.setText("");
                    bt.setTextSize(35);
                    bt.setBackgroundResource(R.drawable.menu_dot1);
                    abtime = 210000;
                    break;
                case R.id.menuabBarrier:
                    bt.setText("");
                    bt.setTextSize(35);
                    bt.setBackgroundResource(R.drawable.menu_barrier1);
                    abtime = 210000;
                    break;
                case R.id.menuabBoost:
                    bt.setText("");
                    bt.setTextSize(35);
                    bt.setBackgroundResource(R.drawable.menu_boost1);
                    abtime = 210000;
                    break;
                case R.id.menuabHaste:
                    bt.setText("");
                    bt.setTextSize(35);
                    bt.setBackgroundResource(R.drawable.menu_haste1);
                    abtime = 210000;
                    break;
                case R.id.menuabMana:
                    bt.setText("");
                    bt.setTextSize(35);
                    bt.setBackgroundResource(R.drawable.menu_mana1);
                    abtime = 210000;
                    break;
                case R.id.menuabExhaust:
                    bt.setText("");
                    bt.setTextSize(35);
                    bt.setBackgroundResource(R.drawable.menu_exhaust1);
                    abtime = 210000;
                    break;

            }
            switch (bt.getId()) {
                case R.id.btab1:
                    cdtime1 = new CountDownTimer(abtime, 1000) {
                        @Override
                        public void onTick(long millisUntilFinished) {
                            bt.setText("" + millisUntilFinished / 1000);
                        }

                        @Override
                        public void onFinish() {
                            timeup.start();
                            bt.setText("结束");
                            bt.setEnabled(true);
                        }
                    };
                    break;
                case R.id.btab2:
                    cdtime2 = new CountDownTimer(abtime, 1000) {
                        @Override
                        public void onTick(long millisUntilFinished) {
                            bt.setText("" + millisUntilFinished / 1000);
                        }

                        @Override
                        public void onFinish() {
                            timeup.start();
                            bt.setText("结束");
                            bt.setEnabled(true);
                        }
                    };
                    break;
                case R.id.btab3:
                    cdtime3 = new CountDownTimer(abtime, 1000) {
                        @Override
                        public void onTick(long millisUntilFinished) {
                            bt.setText("" + millisUntilFinished / 1000);
                        }

                        @Override
                        public void onFinish() {
                            timeup.start();
                            bt.setText("结束");
                            bt.setEnabled(true);
                        }
                    };
                    break;
                case R.id.btab4:
                    cdtime4 = new CountDownTimer(abtime, 1000) {
                        @Override
                        public void onTick(long millisUntilFinished) {
                            bt.setText("" + millisUntilFinished / 1000);
                        }

                        @Override
                        public void onFinish() {
                            timeup.start();
                            bt.setText("结束");
                            bt.setEnabled(true);
                        }
                    };
                    break;
                case R.id.btab5:
                    cdtime5 = new CountDownTimer(abtime, 1000) {
                        @Override
                        public void onTick(long millisUntilFinished) {
                            bt.setText("" + millisUntilFinished / 1000);
                        }

                        @Override
                        public void onFinish() {
                            timeup.start();
                            bt.setText("结束");
                            bt.setEnabled(true);
                        }
                    };
                    break;
                case R.id.btab6:
                    cdtime6 = new CountDownTimer(abtime, 1000) {
                        @Override
                        public void onTick(long millisUntilFinished) {
                            bt.setText("" + millisUntilFinished / 1000);
                        }

                        @Override
                        public void onFinish() {
                            timeup.start();
                            bt.setText("结束");
                            bt.setEnabled(true);
                        }
                    };
                    break;
                case R.id.btab7:
                    cdtime7 = new CountDownTimer(abtime, 1000) {
                        @Override
                        public void onTick(long millisUntilFinished) {
                            bt.setText("" + millisUntilFinished / 1000);
                        }

                        @Override
                        public void onFinish() {
                            timeup.start();
                            bt.setText("结束");
                            bt.setEnabled(true);
                        }
                    };
                    break;
                case R.id.btab8:
                    cdtime8 = new CountDownTimer(abtime, 1000) {
                        @Override
                        public void onTick(long millisUntilFinished) {
                            bt.setText("" + millisUntilFinished / 1000);
                        }

                        @Override
                        public void onFinish() {
                            timeup.start();
                            bt.setText("结束");
                            bt.setEnabled(true);
                        }
                    };
                    break;
                case R.id.btab9:
                    cdtime9 = new CountDownTimer(abtime, 1000) {
                        @Override
                        public void onTick(long millisUntilFinished) {
                            bt.setText("" + millisUntilFinished / 1000);
                        }

                        @Override
                        public void onFinish() {
                            timeup.start();
                            bt.setText("结束");
                            bt.setEnabled(true);
                        }
                    };
                    break;
                case R.id.btab10:
                    cdtime10 = new CountDownTimer(abtime, 1000) {
                        @Override
                        public void onTick(long millisUntilFinished) {
                            bt.setText("" + millisUntilFinished / 1000);
                        }

                        @Override
                        public void onFinish() {
                            timeup.start();
                            bt.setText("结束");
                            bt.setEnabled(true);
                        }
                    };
                    break;
            }
            cdB = new CountDownTimer(abtime, 1000) {
                @Override
                public void onTick(long millisUntilFinished) {
                    bt.setText("" + millisUntilFinished / 1000);
                }

                @Override
                public void onFinish() {
                    timeup.start();
                    bt.setText("结束");
                    bt.setEnabled(true);
                }
            };
        }
    }

    public class BtTimecanceler {//取消计时
        private Button btcancel;
        private CountDownTimer cdtime;

        public void bttimecanceler(Button btcancel, CountDownTimer cdtime) {
            this.btcancel = btcancel;
            this.cdtime = cdtime;
            if (btcancel.getText().toString().equals("召唤师技能")) {
                Toast.makeText(MainActivity.this, "请先开始计时", Toast.LENGTH_SHORT).show();
            } else {
                btcancel.setText("取消");
                cdtime.cancel();
                btcancel.setEnabled(true);
            }
        }
    }

    public class BtTimeStart {//开始计时
        private Button btstart;
        private CountDownTimer cdtime;

        public void bttimestart(Button btstart, CountDownTimer cdtime) {
            this.btstart = btstart;
            this.cdtime = cdtime;
            if (btstart.getText().toString().equals("召唤师技能")) {
                Toast.makeText(MainActivity.this, "请先长按选择召唤师技能", Toast.LENGTH_SHORT).show();
            } else {
                cdtime.start();
                btstart.setEnabled(false);
            }
        }
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        btab1 = (Button) findViewById(R.id.btab1);
        btab2 = (Button) findViewById(R.id.btab2);
        btab3 = (Button) findViewById(R.id.btab3);
        btab4 = (Button) findViewById(R.id.btab4);
        btab5 = (Button) findViewById(R.id.btab5);
        btab6 = (Button) findViewById(R.id.btab6);
        btab7 = (Button) findViewById(R.id.btab7);
        btab8 = (Button) findViewById(R.id.btab8);
        btab9 = (Button) findViewById(R.id.btab9);
        btab10 = (Button) findViewById(R.id.btab10);
        stop1 = (TextView) findViewById(R.id.stop1);
        timeup = MediaPlayer.create(this, R.raw.timeup);
        stop1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BtTimecanceler timecancel = new BtTimecanceler();
                timecancel.bttimecanceler(btab1, cdtime1);
            }
        });
        stop1.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                BtTimecanceler timecancel = new BtTimecanceler();
                timecancel.bttimecanceler(btab2, cdtime2);
                return true;
            }
        });
        stop2 = (TextView) findViewById(R.id.stop2);
        stop2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BtTimecanceler timecancel = new BtTimecanceler();
                timecancel.bttimecanceler(btab3, cdtime3);
            }
        });
        stop2.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                BtTimecanceler timecancel = new BtTimecanceler();
                timecancel.bttimecanceler(btab4, cdtime4);
                return true;
            }
        });
        stop3 = (TextView) findViewById(R.id.stop3);
        stop3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BtTimecanceler timecancel = new BtTimecanceler();
                timecancel.bttimecanceler(btab5, cdtime5);
            }
        });
        stop3.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                BtTimecanceler timecancel = new BtTimecanceler();
                timecancel.bttimecanceler(btab6, cdtime6);
                return true;
            }
        });
        stop4 = (TextView) findViewById(R.id.stop4);
        stop4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BtTimecanceler timecancel = new BtTimecanceler();
                timecancel.bttimecanceler(btab7, cdtime7);
            }
        });
        stop4.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                BtTimecanceler timecancel = new BtTimecanceler();
                timecancel.bttimecanceler(btab8, cdtime8);
                return true;
            }
        });
        stop5 = (TextView) findViewById(R.id.stop5);
        stop5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BtTimecanceler timecancel = new BtTimecanceler();
                timecancel.bttimecanceler(btab9, cdtime9);
            }
        });
        stop5.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                BtTimecanceler timecancel = new BtTimecanceler();
                timecancel.bttimecanceler(btab10, cdtime10);
                return true;
            }
        });


        btab1.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                popab1 = new PopupMenu(MainActivity.this, btab1);
                getMenuInflater().inflate(R.menu.abilitymenu, popab1.getMenu());
                popab1.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {

                    public boolean onMenuItemClick(MenuItem item) {
                        MenuItemClick mic = new MenuItemClick();
                        mic.OnMenuItemClick(item, btab1);
                        return true;
                    }
                });
                popab1.show();

                return true;
            }
        });
        btab1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BtTimeStart bttimestart = new BtTimeStart();
                bttimestart.bttimestart(btab1, cdtime1);
            }
        });
        btab2.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {

                popab2 = new PopupMenu(MainActivity.this, btab2);
                getMenuInflater().inflate(R.menu.abilitymenu, popab2.getMenu());
                popab2.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem item) {
                        MenuItemClick mic = new MenuItemClick();
                        mic.OnMenuItemClick(item, btab2);
                        return true;
                    }
                });
                popab2.show();
                return true;
            }
        });

//

        btab2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BtTimeStart bttimestart = new BtTimeStart();
                bttimestart.bttimestart(btab2, cdtime2);
            }
        });
        btab3.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                popab3 = new PopupMenu(MainActivity.this, btab3);
                getMenuInflater().inflate(R.menu.abilitymenu, popab3.getMenu());
                popab3.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem item) {
                        MenuItemClick mic = new MenuItemClick();
                        mic.OnMenuItemClick(item, btab3);
                        return true;
                    }
                });
                popab3.show();

                return true;
            }
        });
        btab3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BtTimeStart bttimestart = new BtTimeStart();
                bttimestart.bttimestart(btab3, cdtime3);
            }
        });
        btab4.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                popab4 = new PopupMenu(MainActivity.this, btab4);
                getMenuInflater().inflate(R.menu.abilitymenu, popab4.getMenu());
                popab4.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem item) {
                        MenuItemClick mic = new MenuItemClick();
                        mic.OnMenuItemClick(item, btab4);
                        return true;
                    }
                });
                popab4.show();

                return true;
            }
        });
        btab4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BtTimeStart bttimestart = new BtTimeStart();
                bttimestart.bttimestart(btab4, cdtime4);
            }
        });
        btab5.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                popab5 = new PopupMenu(MainActivity.this, btab5);
                getMenuInflater().inflate(R.menu.abilitymenu, popab5.getMenu());
                popab5.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem item) {
                        MenuItemClick mic = new MenuItemClick();
                        mic.OnMenuItemClick(item, btab5);
                        return true;
                    }
                });
                popab5.show();

                return true;
            }
        });
        btab5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BtTimeStart bttimestart = new BtTimeStart();
                bttimestart.bttimestart(btab5, cdtime5);
            }
        });
        btab6.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                popab6 = new PopupMenu(MainActivity.this, btab6);
                getMenuInflater().inflate(R.menu.abilitymenu, popab6.getMenu());
                popab6.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem item) {
                        MenuItemClick mic = new MenuItemClick();
                        mic.OnMenuItemClick(item, btab6);
                        return true;
                    }
                });
                popab6.show();

                return true;
            }
        });
        btab6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BtTimeStart bttimestart = new BtTimeStart();
                bttimestart.bttimestart(btab6, cdtime6);
            }
        });
        btab7.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                popab7 = new PopupMenu(MainActivity.this, btab7);
                getMenuInflater().inflate(R.menu.abilitymenu, popab7.getMenu());
                popab7.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem item) {
                        MenuItemClick mic = new MenuItemClick();
                        mic.OnMenuItemClick(item, btab7);
                        return true;
                    }
                });
                popab7.show();

                return true;
            }
        });
        btab7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BtTimeStart bttimestart = new BtTimeStart();
                bttimestart.bttimestart(btab7, cdtime7);
            }
        });
        btab8.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                popab8 = new PopupMenu(MainActivity.this, btab8);
                getMenuInflater().inflate(R.menu.abilitymenu, popab8.getMenu());
                popab8.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem item) {
                        MenuItemClick mic = new MenuItemClick();
                        mic.OnMenuItemClick(item, btab8);
                        return true;
                    }
                });
                popab8.show();

                return true;
            }
        });
        btab8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BtTimeStart bttimestart = new BtTimeStart();
                bttimestart.bttimestart(btab8, cdtime8);
            }
        });
        btab9.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                popab9 = new PopupMenu(MainActivity.this, btab9);
                getMenuInflater().inflate(R.menu.abilitymenu, popab9.getMenu());
                popab9.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem item) {
                        MenuItemClick mic = new MenuItemClick();
                        mic.OnMenuItemClick(item, btab9);
                        return true;
                    }
                });
                popab9.show();

                return true;
            }
        });
        btab9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BtTimeStart bttimestart = new BtTimeStart();
                bttimestart.bttimestart(btab9, cdtime9);
            }
        });
        btab10.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                popab10 = new PopupMenu(MainActivity.this, btab10);
                getMenuInflater().inflate(R.menu.abilitymenu, popab10.getMenu());
                popab10.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem item) {
                        MenuItemClick mic = new MenuItemClick();
                        mic.OnMenuItemClick(item, btab10);
                        return true;
                    }
                });
                popab10.show();
                return true;
            }
        });
        btab10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BtTimeStart bttimestart = new BtTimeStart();
                bttimestart.bttimestart(btab10, cdtime10);
            }
        });


//        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
//        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
//                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
//        drawer.setDrawerListener(toggle);
//        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_BACK) {
            exit();
            return true;
        }
        return super.onKeyDown(keyCode, event);
    }

    private void exit() {
        if ((System.currentTimeMillis() - clickTime) > 2000) {
            Toast.makeText(getApplicationContext(), "再按一次后退键退出程序",
                    Toast.LENGTH_SHORT).show();
            clickTime = System.currentTimeMillis();
        } else {
            Log.e(TAG, "exit application");
            this.finish();
            //          System.exit(0);
        }
    }


    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_clock) {

        } else if (id == R.id.nav_help) {
            Intent intentH=new Intent(MainActivity.this,Help.class);
            startActivity(intentH);

        } else if (id == R.id.nav_about) {
            Intent intentA=new Intent(MainActivity.this,About.class);
            startActivity(intentA);
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

}


